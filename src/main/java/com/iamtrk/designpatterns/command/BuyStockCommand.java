package com.iamtrk.designpatterns.command;

public class BuyStockCommand implements Command {

    StockTrade trade;
    public BuyStockCommand(StockTrade trade) {
        this.trade = trade;
    }

    @Override
    public void execute() {
        System.out.println("buying the stock");
    }
}
