# react-native-intertrop-repro

![Build](https://github.com/KrzysztofMoch/react-native-intertrop-repro/workflows/Pre%20Merge%20Checks/badge.svg)

Reproducer for `RCTEventEmitter` crash on Android with Interop layer enabled.
Repo is made only for android as iOS platform works fine.

To reproduce issue just run the app on android device/emulator.

Expected result is that App will run and event will be sent.

Throwed exception:
```
Event: you must return a valid, non-null value from 'getEventData`, or override 'dispatch' and dispatchModern'. Event: [EVENT_NAME]
```

## Reproducer todo list

- [x] Create a new reproducer project.
- [x] Git clone your repository locally.
- [x] Edit the project to reproduce the failure you're seeing.
- [ ] Push your changes, so that Github Actions can run the CI.
- [ ] Make sure the repository is public and share the link with the issue you reported.
