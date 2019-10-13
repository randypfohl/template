#!/bin/bash -ex
cd Android

./gradlew -PenableReleaseTesting=ON packageFullRelease

#Start the emulator
emulator -avd test21 \
	-memory 512 \
	-no-boot-anim \
	-noaudio \
	-no-window \
	-gpu swiftshader_indirect \
	-wipe-data \
	-verbose \
	-no-snapshot \
	-partition-size 2000 \
EMULATOR_PID=$!

# wait for device to come online and unlock screen
adb wait-for-device shell 'while [[ -z $(getprop sys.boot_completed) ]]; do sleep 1; done; input keyevent 82'
adb shell settings put global window_animation_scale 0
adb shell settings put global transition_animation_scale 0
adb shell settings put global animator_duration_scale 0

# Run all emulator dependent tests including ui tests
export ANDROID_SERIAL=emulator-5554
./gradlew -PenableReleaseTesting=ON connectedFullReleaseAndroidTest

kill $EMULATOR_PID

#Start the emulator
emulator -avd test29 \
	-memory 512 \
	-no-boot-anim \
	-noaudio \
	-no-window \
	-gpu swiftshader_indirect \
	-wipe-data \
	-verbose \
	-no-snapshot \
	-partition-size 2000 \
EMULATOR_PID=$!

# wait for device to come online and unlock screen
adb wait-for-device shell 'while [[ -z $(getprop sys.boot_completed) ]]; do sleep 1; done; input keyevent 82'
adb shell settings put global window_animation_scale 0
adb shell settings put global transition_animation_scale 0
adb shell settings put global animator_duration_scale 0

# Run all emulator dependent tests including ui tests
export ANDROID_SERIAL=emulator-5554
./gradlew -PenableReleaseTesting=ON connectedFullReleaseAndroidTest
