echo getting cookie and storing it in cookies.txt
curl -s -o /dev/null --cookie-jar cookies.txt http://myspringboot-rai-automated-build-hooks.apps.lab01.gpslab.club/greeting

for i in $(seq 1 $1)
do
curl  --cookie cookies.txt  http://myspringboot-rai-automated-build-hooks.apps.lab01.gpslab.club/greeting
printf "\n"
done 
