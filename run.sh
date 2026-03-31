#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"

echo "Stavím projekt..."

mvn -q package >/dev/null

java -jar target/velikonocni-projekt-1.0.0.jar