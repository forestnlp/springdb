package com.springdb.img;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageDao imageDao;

    @Override
    public Image findById(int id) {
        return imageDao.findById(id);
    }

    @Override
    public List<Image> findByTopicId(int topicId) {
        return imageDao.findByTopicId(topicId);
    }
}
