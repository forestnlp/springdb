package com.springdb.img;


import java.util.List;

public interface ImageService {
    Image findById(int id);

    List<Image> findByTopicId(int topicId);
}
