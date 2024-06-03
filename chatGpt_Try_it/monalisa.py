from PIL import Image, ImageDraw

# 모나리자 그림 파일을 엽니다.
image = Image.open("monalisa.jpg")

# 점을 찍을 색상을 지정합니다.
color = (255, 0, 0)

# 점을 찍을 좌표를 저장할 리스트를 생성합니다.
points = []

# 모나리자 윤곽선을 따라 점을 찍습니다.
for x in range(130, 450, 10):
    for y in range(220, 520, 10):
        # 모나리자 윤곽선 위에 있는 점만 리스트에 추가합니다.
        if image.getpixel((x, y)) < (30, 30, 30):
            points.append((x, y))

# 이미지에 점을 찍습니다.
draw = ImageDraw.Draw(image)
for point in points:
    draw.ellipse((point[0]-1, point[1]-1, point[0]+1, point[1]+1), fill=color)

# 결과 이미지를 저장합니다.
image.save("monalisa_dots.jpg")