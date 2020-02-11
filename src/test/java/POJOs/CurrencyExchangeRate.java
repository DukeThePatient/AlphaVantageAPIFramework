package POJOs;


public class CurrencyExchangeRate {

    private String from_Currency_Code;
    private String from_Currency_Name;
    private String to_Currency_Code;
    private String to_Currency_Name;
    private double exchange_Rate;
    private String last_Refreshed;
    private String time_Zone;
    private double bid_price;
    private double ask_price;

    public CurrencyExchangeRate(){}


    public CurrencyExchangeRate(String from_Currency_Code, String from_Currency_Name, String to_Currency_Code,
                                String to_Currency_Name, Double exchange_Rate, String last_Refreshed, String time_Zone,
                                double bid_price, double ask_price) {
        this.from_Currency_Code = from_Currency_Code;
        this.from_Currency_Name = from_Currency_Name;
        this.to_Currency_Code = to_Currency_Code;
        this.to_Currency_Name = to_Currency_Name;
        this.exchange_Rate = exchange_Rate;
        this.last_Refreshed = last_Refreshed;
        this.time_Zone = time_Zone;
        this.bid_price = bid_price;
        this.ask_price = ask_price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
//
//    "Currency Exchange Rate{" +
//            "From Currency Code: " + from_Currency_Code +
//            "\n From Currency Name";

    public String getFrom_Currency_Code() {
        return from_Currency_Code;
    }

    public void setFrom_Currency_Code(String from_Currency_Code) {
        this.from_Currency_Code = from_Currency_Code;
    }

    public String getFrom_Currency_Name() {
        return from_Currency_Name;
    }

    public void setFrom_Currency_Name(String from_Currency_Name) {
        this.from_Currency_Name = from_Currency_Name;
    }

    public String getTo_Currency_Code() {
        return to_Currency_Code;
    }

    public void setTo_Currency_Code(String to_Currency_Code) {
        this.to_Currency_Code = to_Currency_Code;
    }

    public String getTo_Currency_Name() {
        return to_Currency_Name;
    }

    public void setTo_Currency_Name(String to_Currency_Name) {
        this.to_Currency_Name = to_Currency_Name;
    }

    public Double getExchange_Rate() {
        return exchange_Rate;
    }

    public void setExchange_Rate(Double exchange_Rate) {
        this.exchange_Rate = exchange_Rate;
    }

    public String getLast_Refreshed() {
        return last_Refreshed;
    }

    public void setLast_Refreshed(String last_Refreshed) {
        this.last_Refreshed = last_Refreshed;
    }

    public String getTime_Zone() {
        return time_Zone;
    }

    public void setTime_Zone(String time_Zone) {
        this.time_Zone = time_Zone;
    }

    public double getBid_price() {
        return bid_price;
    }

    public void setBid_price(double bid_price) {
        this.bid_price = bid_price;
    }

    public double getAsk_price() {
        return ask_price;
    }

    public void setAsk_price(double ask_price) {
        this.ask_price = ask_price;
    }

    //    private List<String> currencyExchangeRate;
//
//
//    public CurrencyExchangeRate(){
//
//    }
//
//    public CurrencyExchangeRate(List<String> currencyExchangeRate) {
//        this.currencyExchangeRate = currencyExchangeRate;
//    }
//
//    public List<String> getCurrencyExchangeRate() {
//        return currencyExchangeRate;
//    }
//
//    public void setCurrencyExchangeRate(List<String> currencyExchangeRate) {
//        this.currencyExchangeRate = currencyExchangeRate;
//    }
//
//    @Override
//    public String toString() {
//        return "CurrencyExchangeRate{" +
//                "currencyExchangeRate=" + currencyExchangeRate +
//                '}';
//    }
//}
}
