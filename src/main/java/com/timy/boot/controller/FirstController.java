package com.timy.boot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/first")
public class FirstController {

	/** 列表 */
	@RequestMapping
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("index");
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		view.addObject("h", "hello timy");
		return view;
	}

	/** 进入新增 */
	@RequestMapping(value = "/new/{id}" ,method=RequestMethod.POST)
	public String add(@PathVariable long id,HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println(id);
		return "new_post";
	}

	/** 显示 */
	@RequestMapping(value = "/{id}",method=RequestMethod.GET)
	public String get(@PathVariable long id, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println(id);
		return "show_get";
	}

	/** 编辑 */
	@RequestMapping(value = "/{id}/edit",method=RequestMethod.PUT)
	public String edit(@PathVariable long id, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println(id);
		return "edit_put";
	}

	/** 删除 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable long id, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println(id);
		return "delete";
	}
}