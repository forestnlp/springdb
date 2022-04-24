package com.springdb.img;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Image {
    private int id;
    private int topicid;
    private String imgurl;
    private int seq;
}
