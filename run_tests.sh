#!/usr/bin/env bash
cd "$(dirname "$0")" || exit 1

if [ -f .env ]; then
    . .env
fi

./gradlew clean test
