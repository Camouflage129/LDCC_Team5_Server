import pymysql
import csv

f = open("data.csv")
reader = csv.reader(f)
lines = list(reader)
f.close()

conn = pymysql.connect(host='52.79.44.163', port=3306, user='team5', passwd='1234', db='team5', charset ='utf8')
cur = conn.cursor()

for temp in lines :
   sql = "INSERT INTO productinfo (num, id, region, code, volume, weight, address, recipient, phone) VALUES ("\
         +temp[0]+","\
         +"\'"+"test"+"\'"+","\
         +"\'"+temp[1]+"\'"+","\
         +"\'"+temp[2]+"\'"+","\
         +"\'"+temp[3]+"\'"+","\
         +temp[4]+","\
         +"\'"+temp[5]+"\'"+","\
         +"\'"+temp[6]+"\'"+","\
         +"\'0"+temp[7]+"\'"+")"
   print(sql)
   try:
       cur.execute(sql)
       conn.commit()
   except:
       print('error')
       conn.rollback()

cur.close()
conn.close()
