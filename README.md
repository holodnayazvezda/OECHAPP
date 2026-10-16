# OECHAPP

Учебное Android-приложение на Kotlin и Jetpack Compose со сценариями регистрации, входа, подтверждения кода и восстановления пароля. Данные передаются через Retrofit, локальные настройки хранятся в `Storage`.

## Сборка и запуск

Откройте корень проекта в Android Studio, установите Android SDK 34 и выполните синхронизацию Gradle. Используйте JDK, совместимый с версией Android Gradle Plugin проекта; настройки Java указаны в `app/build.gradle.kts`. Минимальная версия устройства — Android API 29.

Для сборки отладочного APK:

```sh
sh gradlew :app:assembleDebug
```

В Windows: `gradlew.bat :app:assembleDebug`. APK появится в `app/build/outputs/apk/debug/`. Для запуска выберите модуль `app` и устройство или эмулятор в Android Studio.

## Устройство проекта

Для сетевых сценариев нужен совместимый сервер. Его адрес задаётся в `app/src/main/java/com/example/oechappfinal/data/network/Api.kt`, методы — в соседнем `ApiService.kt`. Экранные сценарии находятся в `ui/screen/`.
