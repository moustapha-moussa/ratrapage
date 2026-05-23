package com.isi.historique.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.Instant;

/**
 * A SearchHistory.
 */
@Entity
@Table(name = "search_history")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class SearchHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "search_date")
    private Instant searchDate;

    @Column(name = "request")
    private String request;

    @Column(name = "response_date")
    private String responseDate;

    @Column(name = "response_day")
    private String responseDay;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public SearchHistory id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getSearchDate() {
        return this.searchDate;
    }

    public SearchHistory searchDate(Instant searchDate) {
        this.setSearchDate(searchDate);
        return this;
    }

    public void setSearchDate(Instant searchDate) {
        this.searchDate = searchDate;
    }

    public String getRequest() {
        return this.request;
    }

    public SearchHistory request(String request) {
        this.setRequest(request);
        return this;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponseDate() {
        return this.responseDate;
    }

    public SearchHistory responseDate(String responseDate) {
        this.setResponseDate(responseDate);
        return this;
    }

    public void setResponseDate(String responseDate) {
        this.responseDate = responseDate;
    }

    public String getResponseDay() {
        return this.responseDay;
    }

    public SearchHistory responseDay(String responseDay) {
        this.setResponseDay(responseDay);
        return this;
    }

    public void setResponseDay(String responseDay) {
        this.responseDay = responseDay;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchHistory)) {
            return false;
        }
        return getId() != null && getId().equals(((SearchHistory) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SearchHistory{" +
            "id=" + getId() +
            ", searchDate='" + getSearchDate() + "'" +
            ", request='" + getRequest() + "'" +
            ", responseDate='" + getResponseDate() + "'" +
            ", responseDay='" + getResponseDay() + "'" +
            "}";
    }
}
