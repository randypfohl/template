#!/bin/bash
export ANDROID_SDK_ROOT=/opt/android-sdk
export PATH=$PATH:$ANDROID_SDK_ROOT/tools:$ANDROID_SDK_ROOT/platform-tools:$ANDROID_SDK_ROOT/tools/lib/x86_64:$ANDROID_SDK_ROOT/emulator

echo "no" | avdmanager create avd -f -n test21 --abi google_apis/x86 --device "pixel" --package "system-images;android-21;google_apis;x86"
echo "no" | avdmanager create avd -f -n test29 --abi google_apis/x86 --device "pixel" --package "system-images;android-29;google_apis;x86"

wget  $JNLP_AGENT_URL
java -jar agent.jar -jnlpUrl $JNLP_URL -secret $JENKINS_SECRET -workDir $WORKING_DIRECTORY && rm agent*.jar
