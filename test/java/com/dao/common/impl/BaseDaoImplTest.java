package com.dao.common.impl;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;


public class BaseDaoImplTest {
    @RequestMapping("/upload")
    public String addUser(@RequestParam("file") CommonsMultipartFile[] files, HttpServletRequest request) {

        for (int i = 0; i < files.length; i++) {
            System.out.println("fileName---------->" + files[i].getOriginalFilename());

            if (!files[i].isEmpty()) {
                int pre = (int) System.currentTimeMillis();
                try {
                    //拿到输出流，同时重命名上传的文件
                    FileOutputStream os = new FileOutputStream("H:/" + new Date().getTime() + files[i].getOriginalFilename());
                    //拿到上传文件的输入流
                    FileInputStream in = (FileInputStream) files[i].getInputStream();

                    //以写字节的方式写文件
                    int b = 0;
                    while ((b = in.read()) != -1) {
                        os.write(b);
                    }
                    os.flush();
                    os.close();
                    in.close();
                    int finaltime = (int) System.currentTimeMillis();
                    System.out.println(finaltime - pre);

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("上传出错");
                }
            }
        }
        return "/success";
    }


    @RequestMapping("/upload2")
    public String upload2(HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException {
        //创建一个通用的多部分解析器
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //判断 request 是否有文件上传,即多部分请求
        if (multipartResolver.isMultipart(request)) {
            //转换成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            //取得request中的所有文件名
            Iterator<String> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                //记录上传过程起始时的时间，用来计算上传时间
                int pre = (int) System.currentTimeMillis();
                //取得上传文件
                MultipartFile file = multiRequest.getFile(iter.next());
                if (file != null) {
                    //取得当前上传文件的文件名称
                    String myFileName = file.getOriginalFilename();
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在
                    if (myFileName.trim() != "") {
                        System.out.println(myFileName);
                        //重命名上传后的文件名
                        String fileName = "demoUpload" + file.getOriginalFilename();
                        //定义上传路径
                        String path = "H:/" + fileName;
                        File localFile = new File(path);
                        file.transferTo(localFile);
                    }
                }
                //记录上传该文件后的时间
                int finaltime = (int) System.currentTimeMillis();
                System.out.println(finaltime - pre);
            }

        }
        return "/success";
    }

    @RequestMapping("/toUpload")
    public String toUpload() {
        /*for (int i = 0; i < file.length; i++) {
            if (!file[i].isEmpty()) {
                String fileName = file[i].getOriginalFilename();

                String[] names = fileName.split("\\.");
                boolean gs = false;
                String hz = "";
                if (names.length > 1) {
                    hz = names[names.length - 1];
                    if (!"xls".equalsIgnoreCase(hz) && !"xlsx".equalsIgnoreCase(hz)) {
                        gs = true;
                    }
                } else {
                    gs = true;
                }
                if (gs) {// 文件必须为xls、xlsx格式
                    throw new BusinessException("报告格式不对，不能上传！", "");
                }

                String realAdd = "report" + "/" + bs.getDepartmentId() + "/"
                        + ed.getSampleId() + "/"
                        + CommonMethod.getCurrentDate();
                String savePath = request.getSession().getServletContext().getRealPath("/") + realAdd;
                File newFile = new File(savePath.toString(),fileName);
                if ((!newFile.exists()) && (!newFile.isDirectory())) {
                    newFile.mkdirs();
                }
                if (!CommonMethod.isNull(tri.getReportPath())) {
                    boolean isSuccess = true;
                    File oldFile = new File(tri.getReportPath());
                    if (oldFile.exists()) {
                        isSuccess = oldFile.delete();
                    }
                    if (!isSuccess) {
                        throw new BusinessException("文件上传失败！", "");
                    }
                }
                String newFileName = CommonMethod.getNewKey()+hz;();
                //完成文件上传

                file[i].transferTo(newFile);
                triPage.setReportPath(realAdd + "\\" + newFileName + "."
                        + hz);
            }

        }*/
        return "1";
    }
}


