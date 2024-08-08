package org.lesson4.task3;

import java.util.Date;

/**
 * Билет
 */
public class Ticket {
    private int id;
    private int customerId;
    private Date date;
    private String qrcode;
    private boolean enable = true;

    // region GET
    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public String getQrcode() {
        return qrcode;
    }

    public boolean isEnable() {
        return enable;
    }
    // endregion

    // region SET
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    // endregion
}
