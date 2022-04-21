package site.metacoding.blogv3.web.dto.post;

import java.security.Principal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.metacoding.blogv3.domain.category.Category;
import site.metacoding.blogv3.domain.post.Post;
import site.metacoding.blogv3.domain.user.User;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostWriteReqDto {

    @NotBlank
    private Integer categoryId;

    @Size(min = 1, max = 60)
    private String title;

    private MultipartFile thumbnailFile;

    @NotNull
    private String content;

    public Post toEntity(String thumbnail, User principal, Category category) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        post.setThumbnail(thumbnail); // 받아와야 한다
        post.setUser(principal); // 세션에서 가져와야 한다
        post.setCategory(category); // 받아와야 한다
        return post;
    }
}
