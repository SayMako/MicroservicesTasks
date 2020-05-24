package com.sample.monolith.models;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "Venue")
@Table(name = "VENUE")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "IS_OFFLINE")
    private Boolean isOffline;
    @Column(name = "OFFLINE_ADDRESS")
    private String offlineAddress;
    @Column(name = "IS_ONLINE")
    private Boolean isOnline;
    @Column(name = "ONLINE_LINK")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venue venue = (Venue) o;
        return Objects.equals(getId(), venue.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id=" + id +
                ", isOffline=" + isOffline +
                ", offlineAddress='" + offlineAddress + '\'' +
                ", isOnline=" + isOnline +
                ", onlineLink='" + onlineLink + '\'' +
                '}';
    }
}
