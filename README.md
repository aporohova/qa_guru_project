# Проект по автоматизации тестирования для компании [Litres](https://www.litres.ru/)

> Litres Сервис электронных книг №1 в России. Компания ЛитРес, основанная в 2005 году, сегодня является лидером на рынке лицензионных электронных книг в России и странах СНГ. Лауреат «Премии Рунета-2014».

## **Содержание:**

____
* Технологии и инструменты
* Примеры автоматизированных тест-кейсов
* Сборка в Jenkins
* Запуск из терминала
* Allure отчет
* Интеграция с Allure TestOps
* Интеграция с JIRA
* Уведомления в Telegram при помощи бота
* Примеры видео выполнения тестов на Selenoid
____

## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/IntelliJ_IDEA_Icon.svg" width="40" height="40"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java_logo.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="38" height="40"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="40" height="40"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="40" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/testops.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/jenkins.svg" width="40" height="40"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira_(Software)_logo.svg" width="100" height="50"  alt="Jira"/></a>  
</p>

___
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
___
* ✓ *Проверка работы поиска*
* ✓ *Возможность логина через vk*
* ✓ *Логин по номеру телефона с не валидным значением*
* ✓ *Проверка наличия вакансий в ИТ*
* ✓ *Проверка открытия новой вкладки для партнера Ozon*

___

## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Project_For_Litres/)</a>


### **Параметры сборки в Jenkins:**

## Команды для запуска из терминала
___
***Локальный запуск***

```bash  
gradle clean smoke_test
```
***Удалённый запуск через Jenkins:***
```bash  
clean
${TASK}
-Dbase_url="${SITE_BASE_URL}"
-Dselenoid_url="${SELENOID_URL}"
-Dselenoid_login_password="${SELENOID_LOGIN}:${SELENOID_PASSWORD}"
-Dbrowser="${BROWSER}"
-Dbrowser_size="${BROWSER_SIZE}"
```

