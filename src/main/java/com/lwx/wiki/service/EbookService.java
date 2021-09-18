package com.lwx.wiki.service;

import com.lwx.wiki.domain.Ebook;
import com.lwx.wiki.domain.EbookExample;
import com.lwx.wiki.mapper.EbookMapper;
import com.lwx.wiki.req.EbookReq;
import com.lwx.wiki.resp.EbookResp;
import com.lwx.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebookList) {
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
//        对象复制用这句
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }
//        列表复制用这句
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return  list;
    }
}
