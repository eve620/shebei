package com.fin.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fin.system.commen.R;
import com.fin.system.dto.FileChunkDto;
import com.fin.system.entity.FileStorage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 文件存储表(FileStorage)表服务接口
 *
 * @author 散装java
 * @since 2022-11-15 17:49:41
 */
public interface FileStorageService extends IService<FileStorage> {
    R<List<FileStorage>> getFileList(HttpServletRequest request, String parent);

    /**
     * 文件上传接口
     *
     * @param dto 入参
     * @return
     */
    Boolean uploadFile(FileChunkDto dto);

    /**
     * 下载文件
     *
     * @param identifier
     * @param request
     * @param response
     */
    void downloadByIdentifier(String identifier, HttpServletRequest request, HttpServletResponse response, String range);
}

