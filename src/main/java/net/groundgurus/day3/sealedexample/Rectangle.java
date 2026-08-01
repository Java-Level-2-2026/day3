package net.groundgurus.day3.sealedexample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public final class Rectangle extends Shape {
    private int width;
    private int height;
}
