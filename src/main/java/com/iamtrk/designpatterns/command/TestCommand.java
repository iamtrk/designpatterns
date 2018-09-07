package com.iamtrk.designpatterns.command;

public class TestCommand {

    public static void main(String[] args) {
        StockTrade trade = new StockTrade();

        BuyStockCommand buyStockCommand = new BuyStockCommand(trade);
        SellStockCommand sellStockCommand = new SellStockCommand(trade);

        Agent agent = new Agent();

        agent.placeCommand(buyStockCommand);
        agent.placeCommand(sellStockCommand);
    }
}
