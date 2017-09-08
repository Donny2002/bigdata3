# 톰캣 서버로부터 Volume 설정 정보를 받아 USB로 보낸다.
import requests
import json
import serial
import time

ser = serial.Serial('COM6') # 시리얼 포트를 준비한다.
time.sleep(2) # 장비와 연결될 시간을 확보한다.
print("시리얼 포트가 준비되었습니다.") 

while True:
    ser.write(b'vol')
    value = str(ser.readline(), 'utf-8').rstrip()
    response = requests.get("http://localhost:8080/arduino/json/setVolume/" + value)
    print("setVolume=" + value)
    
    #response = requests.get("http://localhost:8080/arduino/json/getVolume")
    #obj = json.loads(response.text)
    
    #ser.write(str(obj["data"]).encode()) # 장비로 바이트 배열을 보낸다.
    #line = ser.readline() # 장비로부터 바이트 배열을 받는다.
    #print(str(line, 'utf-8').rstrip()) # 바이트 배열을 string 객체로 변환한 후 출력한다.

    time.sleep(5)
    
ser.close()
print("종료!")