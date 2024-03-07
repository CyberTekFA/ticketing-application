package com.hypertek.enums;

import lombok.Getter;

@Getter
public enum STATUS {
    COMPLETE("Complete"), IN_PROGRESS("In_progress"),OPEN("Open");
    private final String value;
    STATUS(String value){
        this.value = value;
    }
}
