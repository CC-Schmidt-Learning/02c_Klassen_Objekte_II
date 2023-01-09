package com;

import java.sql.Timestamp;

public class Text {
 private String subjectLine;
 private String applicationText;
 private String greetingLine;
 private String signature;
 private String place;
 private Timestamp currTimestamp;

public Text(String subjectLine, String applicationText, String greetingLine, String signature, String place,
        Timestamp currTimestamp) {
    this.subjectLine = subjectLine;
    this.applicationText = applicationText;
    this.greetingLine = greetingLine;
    this.signature = signature;
    this.place = place;
    this.currTimestamp = currTimestamp;
} 
}
