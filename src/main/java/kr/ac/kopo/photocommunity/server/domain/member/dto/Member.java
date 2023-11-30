package kr.ac.kopo.photocommunity.server.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @NotNull
    private Long memberNum;
    @NotBlank
    private String email;
    @NotBlank
    private String passwd;

    private String name;

}