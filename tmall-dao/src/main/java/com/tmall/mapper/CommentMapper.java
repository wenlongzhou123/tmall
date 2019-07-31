package com.tmall.mapper;

import com.tmall.pojo.Comment;
import com.tmall.pojo.CommentExample;
import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer comment_id);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer comment_id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}