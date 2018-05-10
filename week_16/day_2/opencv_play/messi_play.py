import cv2
import numpy

img = cv2.imread("messi.jpg")

# point 1: 360x280
# point 2: 410x330
# [y1:y2, x1:x2]

ball = img[280:330, 360:410]

img[180:230, 260:310] = ball
cv2.imwrite("messi_modified.jpg",img)
