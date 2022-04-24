package com.springdb.img;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImageDaoImpl implements ImageDao {


    @Autowired
    private JdbcTemplate template;

    @Override
    public Image findById(int id) {
        BeanPropertyRowMapper<Image> rowMapper =new BeanPropertyRowMapper<>();
        rowMapper.setMappedClass(Image.class);
        return template.queryForObject("select id,topicid,imgurl,seq from img where id = ?",rowMapper,id);
    }

    @Override
    public List<Image> findByTopicId(int topicId) {
        BeanPropertyRowMapper<Image> rowMapper =new BeanPropertyRowMapper<>(Image.class);
        return template.query("select * from img where topicid=?",rowMapper,topicId);
    }
}
