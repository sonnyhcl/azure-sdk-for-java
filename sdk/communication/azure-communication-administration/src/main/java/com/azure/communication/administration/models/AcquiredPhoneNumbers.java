// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AcquiredPhoneNumbers model. */
@Fluent
public final class AcquiredPhoneNumbers {
    /*
     * Represents a list of phone numbers
     */
    @JsonProperty(value = "phoneNumbers")
    private List<AcquiredPhoneNumber> phoneNumbers;

    /*
     * Represents the URL link to the next page
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the phoneNumbers property: Represents a list of phone numbers.
     *
     * @return the phoneNumbers value.
     */
    public List<AcquiredPhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * Set the phoneNumbers property: Represents a list of phone numbers.
     *
     * @param phoneNumbers the phoneNumbers value to set.
     * @return the AcquiredPhoneNumbers object itself.
     */
    public AcquiredPhoneNumbers setPhoneNumbers(List<AcquiredPhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * Get the nextLink property: Represents the URL link to the next page.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Represents the URL link to the next page.
     *
     * @param nextLink the nextLink value to set.
     * @return the AcquiredPhoneNumbers object itself.
     */
    public AcquiredPhoneNumbers setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
