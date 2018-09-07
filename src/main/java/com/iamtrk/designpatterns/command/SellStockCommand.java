package com.iamtrk.designpatterns.command;

public class SellStockCommand implements Command {

    StockTrade trade;
    public SellStockCommand(StockTrade trade) {
        this.trade = trade;
    }

    @Override
    public void execute() {
        System.out.println("selling the stock");
    }
}
