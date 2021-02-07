from PIL import Image
import pytesseract
# 把彩色图像转化为灰度图像。通过灰度处理可以把色彩空间由RGB转化为HIS
im = Image.open('test.jpg')
gray = im.convert('L')
gray.show()
gray.save('test_gray.jpg')

# 图片降噪
# 二值化处理。可以看到，验证码中文本的部分颜色都比较深，因此可以把大于某个临界灰度值的像素灰度设为灰度极大值，把小于这个值的像素灰度设为灰度极小值，从而实现二值化
threshold = 150
table = []
for i in range(256):
    if i <threshold:
        table.append(0)
    else:
        table.append(1)
out = gray.point(table,'1')
out.show()
out.save('test_thresholded.jpg')
#使用Tesseract进行图片识别
th = Image.open('test_thresholded.jpg')
print(pytesseract.image_to_string(th))
