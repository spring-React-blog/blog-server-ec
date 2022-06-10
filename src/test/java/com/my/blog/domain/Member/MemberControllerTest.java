//package com.my.blog.domain.Member;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MemberControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    private ObjectMapper objectMapper = new ObjectMapper();
//
//    @Test
//    public void signup() throws Exception {
//        MemberCount membercount = MemberCount.builder()
//                .followerCount(0)
//                .followingCount(0)
//                .build();
//        Member member = Member.builder()
//                .userEmail("aa")
//                .userPassword("bb")
//                .userNickname("cc")
//                .userName("dd")
//                .memberCount(membercount)
//                .build();
////        System.out.println(member);
////        System.out.println(objectMapper.writeValueAsString(member));
//////        Map<String, String> input = new HashMap<>();
//////        input.put("userEmail", "aa");
//////        input.put("userPassword", "bb");
//////        input.put("userName", "dd");
//        mockMvc.perform(post("/api/public/members")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(member)))
//                .andExpect(status().isOk())
//                .andDo(print());
//    }
//
//}
