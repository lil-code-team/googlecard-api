package dev.lilcode.googlecard.types.V2;

import lombok.Builder;

@Builder
public record Color(
    float red,
    float green,
    float blue,
    float alpha
) {
    public static Color toType(java.awt.Color color) {
        float red = color.getRed();
        float green = color.getGreen();
        float blue = color.getBlue();
        float denominator = 255.0F;
        Color.ColorBuilder resultBuilder =
           Color
               .builder()
               .red(red / denominator)
               .green(green / denominator)
               .blue(blue / denominator);
        int alpha = color.getAlpha();
        if (alpha != 255) {
            resultBuilder = resultBuilder.alpha(((float) alpha) / denominator);
        }
        return resultBuilder.build();
    }
}
