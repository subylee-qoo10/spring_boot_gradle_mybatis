package com.run.api.global.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account
{

    private Long account_srl;
    private Long member_srl;
    private String member_id;
    private LocalDateTime created_at;
    private String status_type;


}