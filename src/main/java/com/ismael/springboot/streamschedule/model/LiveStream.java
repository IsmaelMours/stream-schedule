package com.ismael.springboot.streamschedule.model;

import java.time.LocalDateTime;

public record LiveStream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {


}
