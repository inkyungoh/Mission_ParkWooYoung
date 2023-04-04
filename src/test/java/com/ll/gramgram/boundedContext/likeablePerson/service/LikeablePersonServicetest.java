package com.ll.gramgram.boundedContext.likeablePerson.service;

import com.ll.gramgram.boundedContext.instaMember.repository.InstaMemberRepository;
import com.ll.gramgram.boundedContext.instaMember.service.InstaMemberService;
import com.ll.gramgram.boundedContext.likeablePerson.entity.LikeablePerson;
import com.ll.gramgram.boundedContext.likeablePerson.repository.LikeablePersonRepository;

import static org.assertj.core.api.Assertions.*;
import com.ll.gramgram.boundedContext.member.repository.MemberRepository;
import com.ll.gramgram.boundedContext.member.service.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

@SpringBootTest
@ActiveProfiles("test")
public class LikeablePersonServicetest {

    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private LikeablePersonRepository likeablePersonRepository;
    @Autowired
    private LikeablePersonService likeablePersonService;
    @Autowired
    private InstaMemberService instaMemberService;
    @Autowired
    private InstaMemberRepository instaMemberRepository;

    //서비스 구현
    @Test
    @DisplayName("삭제테스트")
    void tests1(){
        Optional<LikeablePerson> li = this.likeablePersonRepository.findById(5L);
        LikeablePerson likeablePerson = li.get();
        likeablePersonService.delete(likeablePerson);
        assertThat(likeablePerson).isNull();
//        Assertions.assertTrue(likeablePerson.equals(null));
    }
}
