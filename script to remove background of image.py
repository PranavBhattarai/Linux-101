#works like charm, if background is plain
from rembg import remove
from PIL import Image
input_path = '/home/pranav/Pictures/picture.jpg'
output_path = '/home/pranav/Pictures/picture.png'
inp = Image.open(input_path)
output = remove(inp)
output.save(output_path)
