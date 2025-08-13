package com.scinest.domain.member;

import com.scinest.global.domain.BaseTimeEntity;
import com.scinest.global.utils.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member")
public class Member extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Comment(value = "회원 ID")
  private Long memberId;

  @Comment(value = "닉네임")
  @Column(name = "nick_name", nullable = false)
  private String nickName;

  @Comment(value = "비밀번호")
  @Column(name = "password", nullable = false)
  private String password;

  @Comment(value = "프로필 URL")
  @Column(name = "profile_url")
  private String profileUrl;

  @Comment(value = "메일")
  @Column(name = "mail", nullable = false)
  private String mail;

  @Comment(value = "소개")
  @Column(name = "introduction")
  private String introduction;

  @Enumerated(EnumType.STRING)
  @Comment(value = "권한")
  @Column(name = "role", nullable = false)
  private Role role;
}
