package com.sample.monolith.dto;

public class VenueDto {
    private Long id;
    private Boolean isOffline;
    private String offlineAddress;
    private Boolean isOnline;
    private String onlineLink;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getOffline() {
        return isOffline;
    }

    public void setOffline(Boolean offline) {
        isOffline = offline;
    }

    public String getOfflineAddress() {
        return offlineAddress;
    }

    public void setOfflineAddress(String offlineAddress) {
        this.offlineAddress = offlineAddress;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public String getOnlineLink() {
        return onlineLink;
    }

    public void setOnlineLink(String onlineLink) {
        this.onlineLink = onlineLink;
    }
}
