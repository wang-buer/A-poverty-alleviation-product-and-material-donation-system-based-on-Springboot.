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
import java.io.IOException;

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

import com.entity.FupinchanpinEntity;
import com.entity.view.FupinchanpinView;

import com.service.FupinchanpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 扶贫产品
 * 后端接口
 *
 * @author
 * @email
 * @date 2022-03-10 19:34:55
 */
@RestController
@RequestMapping("/fupinchanpin")
public class FupinchanpinController {

    @Autowired
    private FupinchanpinService fupinchanpinService;

    @Autowired
    private StoreupService storeupService;

    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, FupinchanpinEntity fupinchanpin,
                  HttpServletRequest request) {

        EntityWrapper<FupinchanpinEntity> ew = new EntityWrapper<FupinchanpinEntity>();
        PageUtils page = fupinchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fupinchanpin), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, FupinchanpinEntity fupinchanpin,
                  HttpServletRequest request) {
        EntityWrapper<FupinchanpinEntity> ew = new EntityWrapper<FupinchanpinEntity>();
        PageUtils page = fupinchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fupinchanpin), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(FupinchanpinEntity fupinchanpin) {
        EntityWrapper<FupinchanpinEntity> ew = new EntityWrapper<FupinchanpinEntity>();
        ew.allEq(MPUtil.allEQMapPre(fupinchanpin, "fupinchanpin"));
        return R.ok().put("data", fupinchanpinService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FupinchanpinEntity fupinchanpin) {
        EntityWrapper<FupinchanpinEntity> ew = new EntityWrapper<FupinchanpinEntity>();
        ew.allEq(MPUtil.allEQMapPre(fupinchanpin, "fupinchanpin"));
        FupinchanpinView fupinchanpinView = fupinchanpinService.selectView(ew);
        return R.ok("查询扶贫产品成功").put("data", fupinchanpinView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        FupinchanpinEntity fupinchanpin = fupinchanpinService.selectById(id);
        fupinchanpin.setClicknum(fupinchanpin.getClicknum() + 1);
        fupinchanpin.setClicktime(new Date());
        fupinchanpinService.updateById(fupinchanpin);
        return R.ok().put("data", fupinchanpin);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        FupinchanpinEntity fupinchanpin = fupinchanpinService.selectById(id);
        fupinchanpin.setClicknum(fupinchanpin.getClicknum() + 1);
        fupinchanpin.setClicktime(new Date());
        fupinchanpinService.updateById(fupinchanpin);
        return R.ok().put("data", fupinchanpin);
    }


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id, String type) {
        FupinchanpinEntity fupinchanpin = fupinchanpinService.selectById(id);
        if (type.equals("1")) {
            fupinchanpin.setThumbsupnum(fupinchanpin.getThumbsupnum() + 1);
        } else {
            fupinchanpin.setCrazilynum(fupinchanpin.getCrazilynum() + 1);
        }
        fupinchanpinService.updateById(fupinchanpin);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FupinchanpinEntity fupinchanpin, HttpServletRequest request) {
        fupinchanpin.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(fupinchanpin);

        fupinchanpinService.insert(fupinchanpin);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FupinchanpinEntity fupinchanpin, HttpServletRequest request) {
        fupinchanpin.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(fupinchanpin);

        fupinchanpinService.insert(fupinchanpin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FupinchanpinEntity fupinchanpin, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(fupinchanpin);
        fupinchanpinService.updateById(fupinchanpin);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        fupinchanpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
     * 提醒接口
     */
    @RequestMapping("/remind/{columnName}/{type}")
    public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request,
                         @PathVariable("type") String type, @RequestParam Map<String, Object> map) {
        map.put("column", columnName);
        map.put("type", type);

        if (type.equals("2")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            Date remindStartDate = null;
            Date remindEndDate = null;
            if (map.get("remindstart") != null) {
                Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
                c.setTime(new Date());
                c.add(Calendar.DAY_OF_MONTH, remindStart);
                remindStartDate = c.getTime();
                map.put("remindstart", sdf.format(remindStartDate));
            }
            if (map.get("remindend") != null) {
                Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
                c.setTime(new Date());
                c.add(Calendar.DAY_OF_MONTH, remindEnd);
                remindEndDate = c.getTime();
                map.put("remindend", sdf.format(remindEndDate));
            }
        }

        Wrapper<FupinchanpinEntity> wrapper = new EntityWrapper<FupinchanpinEntity>();
        if (map.get("remindstart") != null) {
            wrapper.ge(columnName, map.get("remindstart"));
        }
        if (map.get("remindend") != null) {
            wrapper.le(columnName, map.get("remindend"));
        }


        int count = fupinchanpinService.selectCount(wrapper);
        return R.ok().put("count", count);
    }

    /**
     * 前端智能排序
     */
    @IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params, FupinchanpinEntity fupinchanpin, HttpServletRequest request, String pre) {
        EntityWrapper<FupinchanpinEntity> ew = new EntityWrapper<FupinchanpinEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
        Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            String key = entry.getKey();
            String newKey = entry.getKey();
            if (pre.endsWith(".")) {
                newMap.put(pre + newKey, entry.getValue());
            } else if (StringUtils.isEmpty(pre)) {
                newMap.put(newKey, entry.getValue());
            } else {
                newMap.put(pre + "." + newKey, entry.getValue());
            }
        }
        params.put("sort", "clicknum");

        params.put("order", "desc");
        PageUtils page = fupinchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fupinchanpin), params), params));
        return R.ok().put("data", page);
    }


}
