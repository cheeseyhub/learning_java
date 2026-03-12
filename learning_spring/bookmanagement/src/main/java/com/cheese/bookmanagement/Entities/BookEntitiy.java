package com.cheese.bookmanagement.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookEntitiy {
    private long id;;
    private String title;
    private String author;
    private long price;
    
}
