package com.cavlib.service.impl;

import java.awt.print.Printable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cavlib.beans.Post;
import com.cavlib.dao.ImageMapper;
import com.cavlib.dao.PostMapper;
import com.cavlib.service.AdminManagePostService;
import com.github.pagehelper.PageHelper;

@Service
public class AdminManagePostServiceIpml implements AdminManagePostService{
	@Autowired
	private PostMapper postMapper;
	@Autowired
	private ImageMapper imageMapper;
	
	@Override
	public Boolean deletePost(int id) {
		// TODO Auto-generated method stub
		postMapper.deletePost(id);
		imageMapper.deleteImage(id);
		return true;
	}
	
	
	@Override
	public List<Post> loadDeletePage(int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,30);
		return postMapper.getAllDeletePost();
		
		
	}

}
