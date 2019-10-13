#!/bin/bash -ex
cd Android
./gradlew -PenableReleaseTesting=OFF $bundleFullRelease
