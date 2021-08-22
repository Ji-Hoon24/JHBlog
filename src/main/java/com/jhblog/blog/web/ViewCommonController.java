package com.jhblog.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewCommonController {

    @GetMapping("/{path1}")
    public String path1View(@PathVariable("path1") String path1) throws Exception {
        return path1;
    }

    @GetMapping("/{path1}/{path2}")
    public String path2View(@PathVariable("path1") String path1
                            ,@PathVariable("path2") String path2) throws Exception {
        return path1+"/"+path2;
    }

    @GetMapping("/{path1}/{path2}/{path3}")
    public String path3View(@PathVariable("path1") String path1
                            ,@PathVariable("path2") String path2
                            ,@PathVariable("path3") String path3) throws Exception {
        return path1+"/"+path2+"/"+path3;
    }
}
