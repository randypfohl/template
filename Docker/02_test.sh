#!/bin/bash -ex
cd Android
./gradlew -PenableReleaseTesting=ON  testFullReleaseUnitTest
