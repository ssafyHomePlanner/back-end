package com.ssafy.homepjt.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.homepjt.model.dto.RecentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.homepjt.model.dto.MemberDto;
import com.ssafy.homepjt.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public int idCheck(String id) throws SQLException {
        return memberMapper.idCheck(id);
    }

    @Override
    public void join(MemberDto memberDto) throws SQLException {
        memberMapper.join(memberDto);
    }

    @Override
    public MemberDto login(String memberId, String memberPw) throws SQLException {
        return memberMapper.login(memberId, memberPw);
    }

    @Override
    public MemberDto detail(String id) throws SQLException {
        return memberMapper.detail(id);
    }

    @Override
    public void update(MemberDto memberDto) throws SQLException {
        memberMapper.update(memberDto);
    }

    @Override
    public void delete(String id) throws SQLException {
        memberMapper.delete(id);
    }

    @Override
    public String findId(String memberName, String memberPhone) {
        return memberMapper.findId(memberName, memberPhone);
    }

    @Override
    public String findPw(String memberId, String memberPhone) {
        return memberMapper.findPw(memberId, memberPhone);
    }

    @Override
    public void insertRecentData(String memberId, String data) throws SQLException {
        memberMapper.insertRecentData(memberId, data);
    }

    @Override
    public List<RecentDto> searchRecentData(String memberId) throws SQLException {
        return memberMapper.searchRecentData(memberId);
    }

    @Override
    public void deleteRecentData(String memberId, String recentId) throws SQLException {
        memberMapper.deleteRecentData(memberId, recentId);
    }

    @Override
    public void deleteRecentDataAll(String memberId) throws SQLException {
        memberMapper.deleteRecentDataAll(memberId);
    }

}
