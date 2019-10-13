#!/bin/bash -ex
cd Android
./gradlew -PenableReleaseTesting=ON validate lintFullRelease
