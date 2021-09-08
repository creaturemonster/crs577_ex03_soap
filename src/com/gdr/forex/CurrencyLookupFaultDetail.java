package com.gdr.forex;

public class CurrencyLookupFaultDetail {
    private Currency currency;
    private String message;

    public CurrencyLookupFaultDetail(Currency currency, String message) {
        super();
        this.currency = currency;
        this.message = message;
    }

    public Currency getCurrency() {
        return currency;
    }

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
