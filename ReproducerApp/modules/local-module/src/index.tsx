import {
  requireNativeComponent,
  UIManager,
  Platform,
  type ViewStyle,
  NativeSyntheticEvent,
} from 'react-native';

const LINKING_ERROR =
  "The package 'react-native-local-module' doesn't seem to be linked. Make sure: \n\n" +
  Platform.select({ios: "- You have run 'pod install'\n", default: ''}) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

type LocalModuleProps = {
  color: string;
  style: ViewStyle;
  onColorChanged?: (event: NativeSyntheticEvent<object>) => void;
};

const ComponentName = 'LocalModuleView';

export const LocalModuleView =
  UIManager.getViewManagerConfig(ComponentName) != null
    ? requireNativeComponent<LocalModuleProps>(ComponentName)
    : () => {
        throw new Error(LINKING_ERROR);
      };
