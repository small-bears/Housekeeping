package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FuwufenpeiEntity;
import com.entity.view.FuwufenpeiView;

import com.service.FuwufenpeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 服务分配
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
@RestController
@RequestMapping("/fuwufenpei")
public class FuwufenpeiController {
    @Autowired
    private FuwufenpeiService fuwufenpeiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FuwufenpeiEntity fuwufenpei,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fuwufenpei.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("fuwurenyuan")) {
			fuwufenpei.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FuwufenpeiEntity> ew = new EntityWrapper<FuwufenpeiEntity>();
		PageUtils page = fuwufenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwufenpei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FuwufenpeiEntity fuwufenpei, 
		HttpServletRequest request){
        EntityWrapper<FuwufenpeiEntity> ew = new EntityWrapper<FuwufenpeiEntity>();
		PageUtils page = fuwufenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwufenpei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FuwufenpeiEntity fuwufenpei){
       	EntityWrapper<FuwufenpeiEntity> ew = new EntityWrapper<FuwufenpeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fuwufenpei, "fuwufenpei")); 
        return R.ok().put("data", fuwufenpeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FuwufenpeiEntity fuwufenpei){
        EntityWrapper< FuwufenpeiEntity> ew = new EntityWrapper< FuwufenpeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fuwufenpei, "fuwufenpei")); 
		FuwufenpeiView fuwufenpeiView =  fuwufenpeiService.selectView(ew);
		return R.ok("查询服务分配成功").put("data", fuwufenpeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FuwufenpeiEntity fuwufenpei = fuwufenpeiService.selectById(id);
        return R.ok().put("data", fuwufenpei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FuwufenpeiEntity fuwufenpei = fuwufenpeiService.selectById(id);
        return R.ok().put("data", fuwufenpei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FuwufenpeiEntity fuwufenpei, HttpServletRequest request){
    	fuwufenpei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fuwufenpei);
        fuwufenpeiService.insert(fuwufenpei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FuwufenpeiEntity fuwufenpei, HttpServletRequest request){
    	fuwufenpei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fuwufenpei);
        fuwufenpeiService.insert(fuwufenpei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FuwufenpeiEntity fuwufenpei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fuwufenpei);
        fuwufenpeiService.updateById(fuwufenpei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fuwufenpeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FuwufenpeiEntity> wrapper = new EntityWrapper<FuwufenpeiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("fuwurenyuan")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = fuwufenpeiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
