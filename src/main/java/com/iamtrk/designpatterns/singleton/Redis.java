package com.iamtrk.designpatterns.singleton;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.Map;

/*
 * Out of box Redis client for Java based on Jedis.
 * Implemented Singleton design pattern based on Enum. - inspired from Joshua Block's Effective Java
 */
public enum Redis {
    // Singleton instance.
    INSTANCE;

    private final JedisPool pool = new JedisPool(new JedisPoolConfig(), "172.17.0.2");

    //final Logger logger = LoggerFactory.getLogger(Redis.class);

    public void putValue(String key, String value) {
        try (Jedis jedis = pool.getResource()) {
            jedis.set(key, value);
        }
    }

    public String getValue(String key) {
        try (Jedis jedis = pool.getResource()) {
            return jedis.get(key);
        }
    }

    public long zadd(String list, Map<String, Double> map) {
        long res = -1L;
        try(Jedis jedis = pool.getResource()) {
            res = jedis.zadd(list, map);
        }
        return res;
    }

    public long rPush(String list, String value) {
        long res = -1;
        try (Jedis jedis = pool.getResource()) {
            //jedis.select(<DB No.>);
            res = jedis.rpush(list, value);
        } catch (Exception e) {
            //logger.error(e.getMessage());
            return res;
        }
        return res;
    }

    public void closeDb() {
        pool.destroy();
    }

    public static void main(String[] args) {
        String sortedList = "scores";


        Map<String, Double> map = new HashMap<>();
        for (int i=0; i<500000; i++) {
            //Redis.INSTANCE.zadd(sortedList, RandomStringUtils.randomAlphabetic(10), RandomUtils.nextInt());
            map.put(RandomStringUtils.randomAlphabetic(10), (double) RandomUtils.nextInt());
        }
        long t = System.currentTimeMillis();
        Redis.INSTANCE.zadd(sortedList, map);

        map.clear();

        for (int i=0; i<500000; i++) {
            //Redis.INSTANCE.zadd(sortedList, RandomStringUtils.randomAlphabetic(10), RandomUtils.nextInt());
            map.put(RandomStringUtils.randomAlphabetic(10), (double) RandomUtils.nextInt());
        }

        System.out.println((System.currentTimeMillis()-t)/1000);
    }
}
