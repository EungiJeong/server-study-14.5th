package com.appcenter.todolistapi.domain;

import com.appcenter.todolistapi.common.Timestamped;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Member extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @NotNull(message = "이름을 적어주세요")
    private String name;

    @NotNull(message = "나이를 적어주세요")
    private int age;

    @NotNull(message = "이메일을 적어주세요")

    private String email;

    @OneToMany(mappedBy = "member")
    private List<Todo> todoList = new ArrayList<>();

    @Builder
    public Member(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void update(String name, int age){
        this.name = name;
        this.age = age;
    }

//    public void planTodo(TodoRequestDto todoRequestDto){
//        this.todoList.add(todoRequestDto.toEntity());
//    }
}
